.class public Lcom/voxdon/xplorer/activity/VoxExitClick;
.super Ljava/lang/Object;
.implements Landroid/content/DialogInterface$OnClickListener;
.source "VoxExitClick.java"


# instance fields
.field private final a:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/voxdon/xplorer/activity/VoxExitClick;->a:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .registers 3

    iget-object p1, p0, Lcom/voxdon/xplorer/activity/VoxExitClick;->a:Landroid/app/Activity;

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_b
    return-void
.end method
