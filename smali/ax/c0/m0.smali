.class public final synthetic Lax/c0/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lax/c0/q0;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lax/c0/q0;Landroid/view/View;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/c0/m0;->a:Lax/c0/q0;

    iput-object p2, p0, Lax/c0/m0;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/c0/m0;->a:Lax/c0/q0;

    iget-object v1, p0, Lax/c0/m0;->b:Landroid/view/View;

    invoke-static {v0, v1, p1}, Lax/c0/n0;->a(Lax/c0/q0;Landroid/view/View;Landroid/animation/ValueAnimator;)V

    return-void
.end method
