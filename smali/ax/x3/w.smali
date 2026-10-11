.class public final synthetic Lax/x3/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lax/x3/x;

.field public final synthetic b:Landroid/view/View$OnClickListener;


# direct methods
.method public synthetic constructor <init>(Lax/x3/x;Landroid/view/View$OnClickListener;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/x3/w;->a:Lax/x3/x;

    iput-object p2, p0, Lax/x3/w;->b:Landroid/view/View$OnClickListener;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/x3/w;->a:Lax/x3/x;

    iget-object v1, p0, Lax/x3/w;->b:Landroid/view/View$OnClickListener;

    invoke-static {v0, v1, p1}, Lax/x3/x;->a(Lax/x3/x;Landroid/view/View$OnClickListener;Landroid/view/View;)V

    return-void
.end method
