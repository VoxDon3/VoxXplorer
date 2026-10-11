.class public final synthetic Lax/i/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:I

.field public final synthetic d0:Landroid/content/IntentSender$SendIntentException;

.field public final synthetic q:Landroidx/activity/ComponentActivity$f;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/ComponentActivity$f;ILandroid/content/IntentSender$SendIntentException;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/i/k;->q:Landroidx/activity/ComponentActivity$f;

    iput p2, p0, Lax/i/k;->c0:I

    iput-object p3, p0, Lax/i/k;->d0:Landroid/content/IntentSender$SendIntentException;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i/k;->q:Landroidx/activity/ComponentActivity$f;

    iget v1, p0, Lax/i/k;->c0:I

    iget-object v2, p0, Lax/i/k;->d0:Landroid/content/IntentSender$SendIntentException;

    invoke-static {v0, v1, v2}, Landroidx/activity/ComponentActivity$f;->q(Landroidx/activity/ComponentActivity$f;ILandroid/content/IntentSender$SendIntentException;)V

    return-void
.end method
